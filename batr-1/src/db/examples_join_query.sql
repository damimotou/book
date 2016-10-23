-- ������� ������ (����) �� ���� ����������� (�� ����� ������ Car � Transport), ����� ������ id �������� �� ������������ ���������� ������������ �� �������
SELECT

Transport.[issue_date] AS ����_�������,
Transport.[price] AS ����,
spr_Brand.[name_en] AS �����,
spr_Color.[name_ru] AS ����,
spr_Condition.[name_ru] AS ���������,
spr_Currency.[shortname_ru] AS ������,
spr_CarType.[name_ru] AS ���_������,
spr_Model.[name_ru] AS ������,
spr_Transmission.[name_ru] AS �������,
spr_Privod.[name_ru] AS ������,
Car.[capacity] AS �����_���������

FROM Car INNER JOIN Transport ON Car.[transport_id] = [Transport].[id]
         INNER JOIN spr_Brand ON Transport.[brand_id] = spr_Brand.[id]         
         INNER JOIN spr_Color ON Transport.[color_id] = spr_Color.[id] 
         INNER JOIN spr_Condition ON Transport.[condition_id] = spr_Condition.[id]         
         INNER JOIN spr_Currency ON Transport.[currency_id] = spr_Currency.[id]         
         INNER JOIN spr_CarType ON Car.[car_type_id] = spr_CarType.[id]         
         INNER JOIN spr_Model ON Car.[model_id] = spr_Model.[id]         
         INNER JOIN spr_Transmission ON Car.[transmission_id] = spr_Transmission.[id]         
         INNER JOIN spr_Privod ON Car.[privod_id] = spr_Privod.[id]         
ORDER BY Transport.[price] DESC;

-- ������� ������ (����) �� ���� ����������� (�� ����� ������ Car � Transport), ����� ������ id �������� �� ������������ ���������� ������������ �� �������
-- �� ������ ��� ��������� ����
SELECT

Transport.[issue_date] AS ����_�������,
Transport.[price] AS ����,
spr_Brand.[name_en] AS �����,
spr_Color.[name_ru] AS ����,
spr_Condition.[name_ru] AS ���������,
spr_Currency.[shortname_ru] AS ������,
spr_CarType.[name_ru] AS ���_������,
spr_Model.[name_ru] AS ������,
spr_Transmission.[name_ru] AS �������,
spr_Privod.[name_ru] AS ������,
Car.[capacity] AS �����_���������

FROM Car INNER JOIN Transport ON Car.[transport_id] = [Transport].[id]
         INNER JOIN spr_Brand ON Transport.[brand_id] = spr_Brand.[id]         
         INNER JOIN spr_Color ON Transport.[color_id] = spr_Color.[id] 
         INNER JOIN spr_Condition ON Transport.[condition_id] = spr_Condition.[id]         
         INNER JOIN spr_Currency ON Transport.[currency_id] = spr_Currency.[id]         
         INNER JOIN spr_CarType ON Car.[car_type_id] = spr_CarType.[id]         
         INNER JOIN spr_Model ON Car.[model_id] = spr_Model.[id]         
         INNER JOIN spr_Transmission ON Car.[transmission_id] = spr_Transmission.[id]         
         INNER JOIN spr_Privod ON Car.[privod_id] = spr_Privod.[id]    
         INNER JOIN Sale ON Sale.[transport_id] = Transport.[id]     
ORDER BY Transport.[price] DESC;

-- ������ �����, �� ������ ��� ����� Toyota, ���� ������� ������ 3000 $  (��������� ������)
SELECT

DISTINCT Car.[id],                                  -- ���������� ������������ ��������� ����
Transport.[issue_date] AS ����_�������,
Transport.[price] AS ����,
spr_Brand.[name_en] AS �����,
spr_Color.[name_ru] AS ����,
spr_Condition.[name_ru] AS ���������,
spr_Currency.[shortname_ru] AS ������,
spr_CarType.[name_ru] AS ���_������,
spr_Model.[name_ru] AS ������,
spr_Transmission.[name_ru] AS �������,
spr_Privod.[name_ru] AS ������,
Car.[capacity] AS �����_���������

FROM Car INNER JOIN Transport ON Car.[transport_id] = [Transport].[id]
         INNER JOIN spr_Brand ON Transport.[brand_id] = spr_Brand.[id]         
         INNER JOIN spr_Color ON Transport.[color_id] = spr_Color.[id] 
         INNER JOIN spr_Condition ON Transport.[condition_id] = spr_Condition.[id]         
         INNER JOIN spr_Currency ON Transport.[currency_id] = spr_Currency.[id]         
         INNER JOIN spr_CarType ON Car.[car_type_id] = spr_CarType.[id]         
         INNER JOIN spr_Model ON Car.[model_id] = spr_Model.[id]         
         INNER JOIN spr_Transmission ON Car.[transmission_id] = spr_Transmission.[id]         
         INNER JOIN spr_Privod ON Car.[privod_id] = spr_Privod.[id]    
         INNER JOIN Sale ON Sale.[transport_id] = Transport.[id] 
                      
WHERE spr_Brand.[name_en] = 'Toyota' AND Transport.[price] < 3000 AND Transport.[currency_id] = 1

ORDER BY Transport.[price] DESC;

-- �� ������� �������� ������� ���-�� ��������� �� �����������
SELECT
Seller.id, 
Seller.fio AS ���_��������,
COUNT(Seller.fio) AS �����������_������                         -- ������� ���� ������ � ������������


FROM Seller INNER JOIN Sale ON Seller.[id] = Sale.[seller_id]
GROUP BY Seller.fio, Seller.id                                  -- ��� ���� ������� COUNT(Seller.fio) - ��������� ������� � 1 ������
ORDER BY Seller.fio 

-- ������� ��������� ������� �� �������� ����������� �� ������ 2011 �
SELECT 

SUM(Transport.[price]) AS �������

FROM Sale INNER JOIN Transport ON Sale.transport_id = Transport.[id]
WHERE  STRFTIME('%Y', Sale.[sale_date])='2011'
AND  STRFTIME('%m', Sale.[sale_date])='01'

-- �������� ���� ���������, ������� ������� ���� �� ���� ����������� ������
SELECT
Seller.[fio]
FROM Seller INNER JOIN Sale ON Sale.[seller_id] = Seller.[id]
            INNER JOIN Transport ON Sale.[transport_id] = Transport.id
WHERE Transport.[condition_id] = 2;

-- �������� ���� ���������, ������� �� ������� �� ����� ������, ������� � ���������� ������� �� ���
SELECT
Seller.fio
FROM Seller LEFT JOIN Sale ON Sale.[seller_id] = Seller.[id]
WHERE Sale.[transport_id] IS NULL
ORDER BY Seller.[fio]

-- �������� �� ������� �������� ���������� ��������� �� ����� ����� Toyota, ��� ���� >= 1000 $
SELECT
Transport.[price],
Seller.[fio],
COUNT(Sale.[transport_id])
FROM Seller INNER JOIN Sale ON Sale.[seller_id] = Seller.[id]
            INNER JOIN Transport ON Sale.transport_id = Transport.[id]

--WHERE Transport.[brand_id] = 1 AND Transport.price >= 1000 AND Transport.[currency_id] = 2  -- ����� �������� HAVING
GROUP BY Seller.fio
HAVING Transport.[brand_id] = 1 AND Transport.price >= 1000 AND Transport.[currency_id] = 2
               
               
