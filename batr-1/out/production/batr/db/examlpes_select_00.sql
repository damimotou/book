-- ������� ��� ������ �� ������� spr_Model � ���������� ���� name_ru, name_en
--SELECT name_ru, name_en FROM spr_Model;

-- ������� ��� ������ �� ������� Car � ���������� ��� ����
--SELECT * FROM Car;

-- ������� ���������� ������ �� ������� Car
--SELECT DISTINCT(model_id) FROM Car;

-- ������� ��� ������ �� ������� Transport � �-�� ���� <= 5000. ���������� ��� �������.
--SELECT * FROM Transport WHERE price <= 5000;

-- ������� ��� ������ �� ������� Transport � �-�� ���� <= 5000 � ��� ������� > 1 ��� 2010�. ���������� ��� �������.
--SELECT * FROM Transport WHERE price <= 5000 AND issue_date >= '2010-01-01';

-- ������� ������ �� ������� Car � �-�� id = 5 (��������� 1 ��� 0)
--SELECT * FROM Car WHERE id = 5;

-- ������� ��� ������ �� ������� Transport � �-�� ���� <= 5000 � ����������� ��������� �� ���� �������.
--SELECT * FROM Transport WHERE price <= 5000 ORDER BY issue_date;

-- ������� ��� ������ �� ������� Transport � ����������� ��������� ��������� �������. ���������� ��� �������.
--SELECT * FROM Transport ORDER BY RANDOM();

-- ������� ��� ������ �� ������� Transport � �-�� ���� <= 5000 � ���������� 4 ������ ������� �� 2.
--SELECT * FROM Transport WHERE price <= 5000 LIMIT 2,4;

-- �������� ���-�� ������� � ������� Transport
--SELECT COUNT(*) FROM Transport;

-- �������� ������������ ����� ��������� ����� ���� �����������
--SELECT MAX(capacity) FROM Car;

-- �������� ����� ��������� ���� ��������� ������������ �������
--SELECT SUM(price) FROM Transport;

-- �������� ���-�� ������� � ������� Transport � ������� ������� "transport_count"
--SELECT COUNT(*) AS transport_count FROM Transport;

-- �������� �� ������� �������� ���-�� ��������� �� �����
--SELECT seller_id, COUNT(transport_id) FROM Sale GROUP BY seller_id;

-- �������� �� ������� �������� ���-�� ��������� �� �����, ����������� �� ��������, � ����� ��� ������� �� ��� �� ����
SELECT seller_id, sale_date, COUNT(transport_id) FROM Sale GROUP BY seller_id, sale_date;





