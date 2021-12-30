SELECT
    CART_ID
FROM
    (SELECT
        CART_ID,
        SUM(CASE WHEN NAME = 'Milk' THEN 1 ELSE 0 END) AS MILK_CNT,
        SUM(CASE WHEN NAME = 'Yogurt' THEN 1 ELSE 0 END) AS YOGURT_CNT
    FROM
        CART_PRODUCTS
    GROUP BY
        CART_ID
    )
WHERE
    MILK_CNT > 0 AND YOGURT_CNT > 0
ORDER BY
    CART_ID
