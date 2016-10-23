-- �������� ������ �� ����������, �-�� ���� �������
--SELECT 
--*
--FROM Car WHERE transport_id IN (SELECT transport_id FROM Sale);

-- �������� ���������� ����� Golf
--SELECT 
--*
--FROM Car WHERE model_id IN (SELECT id FROM spr_Model WHERE name_en = 'Golf');

-- ��������� SELECT (����� ���������� ������ ���� ��������) - ������������ INNER JOIN
--SELECT
--price,
----currency_id
--(SELECT name_ru FROM spr_Currency WHERE id = Transport.[currency_id]) AS '������',   -- ����������� �������� ����� ������
----brand_id
--(SELECT name_en FROM spr_Brand WHERE id = Transport.[brand_id]) AS '�����'           -- ����������� �������� ����� ������
--FROM Transport;

-- SELECT FROM ��������� ������ (2)
--SELECT 
--s.[transport_id],
--t.[price]
--FROM Transport t, Sale s WHERE t.[id] = s.[transport_id];  -- ����������� �������� ����� ������

-- SELECT FROM ��������� ������ (3 
SELECT 
s.[transport_id],
t.[price],
spr_Brand.[name_en]
FROM Transport t, Sale s, spr_Brand WHERE t.[id] = s.[transport_id] AND spr_Brand.[id] = t.[brand_id];                                     -- the same
--FROM Transport t, (SELECT * FROM Sale WHERE id = 3) AS s, spr_Brand WHERE t.[id] = s.[transport_id] AND spr_Brand.[id] = t.[brand_id];   -- the same


