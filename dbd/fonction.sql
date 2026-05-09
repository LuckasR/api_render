CREATE OR REPLACE FUNCTION get_grille_tarif(
    p_company_id INT,
    p_zone_id INT,
    p_type_operation_id INT
)
RETURNS TABLE (
    frais_id INT,
    operatur_id INT,
    type_operation_id INT ,
    zone_id INT,
    grille_id INT,
    type_operation TEXT,
    zone_code TEXT,
    montant_min NUMERIC,
    montant_max NUMERIC,
    created_at TIMESTAMP,
    montant NUMERIC,
    company_id INT
)
AS $$
BEGIN
    RETURN QUERY
    SELECT 
        f.id,
        gt.operateur_id, 
        gt.type_operation_id,
        f.zone_id , 
        gt.id,
        tx.code::TEXT,
        zx.code::TEXT,
        gt.montant_min,
        gt.montant_max,
        gt.created_at,
        f.montant,
        f.company_id
    FROM grille_tarifaire gt

    JOIN type_operation tx 
        ON tx.id = gt.type_operation_id

    LEFT JOIN LATERAL (
        SELECT *
        FROM frais f
        WHERE f.grille_id = gt.id
          AND (f.zone_id = p_zone_id OR f.zone_id IS NULL)
          AND (f.company_id = p_company_id OR f.company_id IS NULL)
        ORDER BY 
            CASE 
                WHEN f.company_id = p_company_id THEN 1
                ELSE 2
            END
        LIMIT 1
    ) f ON true

    LEFT JOIN zone zx 
        ON zx.id = f.zone_id

    WHERE gt.type_operation_id = p_type_operation_id;
END;
$$ LANGUAGE plpgsql;



 