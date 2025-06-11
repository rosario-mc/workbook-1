## **1–5: Simple Joins**
1. **List all products with their supplier company name.**
SELECT ProductID, ProductName, s.SupplierID
FROM northwind.products AS p
JOIN suppliers AS s
ON s.SupplierID = p.SupplierID;

2. **Show each order with the company name of the customer who placed it.**
SELECT o.OrderID, CompanyName, ProductId, UnitPrice, Quantity, Discount
FROM northwind.orders AS o
JOIN customers AS c
ON c.CustomerID = o.CustomerID
JOIN `Order Details`  AS od
ON o.OrderID = od.OrderID;

3. **Show all products with their category names.**
SELECT ProductName, c.CategoryID
FROM northwind.products AS p
JOIN categories AS c
ON p.CategoryID = c.CategoryID;

4. **List all employees with their territories.**
SELECT FirstName, LastName, TerritoryDescription
FROM northwind.employees AS e
JOIN employeeterritories AS et
ON e.EmployeeID = et.EmployeeID
JOIN territories as t
ON et.TerritoryID = t.TerritoryID;

5. **Show the unit price and supplier name for each product.**
SELECT CompanyName, ProductName, UnitPrice
FROM northwind.products AS p
JOIN suppliers AS s
ON p.SupplierID = s.SupplierID;

## 🟡 **6–10: Two- and Three-Table Joins**

6. **List all orders with the customer name and order date.**
SELECT CompanyName, OrderDate, OrderID
FROM northwind.orders AS o
JOIN customers AS c
ON o.CustomerID = c.CustomerID;

7. **Show order details including order ID, product name, and quantity.**
SELECT OrderID, ProductName, Quantity
FROM northwind.`order details` AS od
JOIN products AS p
ON od.ProductID = p.ProductID;

8. **List each order with its order date and the name of each product in that order.**
SELECT od.OrderID, OrderDate, ProductName
FROM northwind.`order details` AS od
JOIN orders AS o
ON od.OrderID = o.OrderID
JOIN products AS p
ON od.ProductID = p.ProductID;

9. **Show products along with their supplier and category names.**
SELECT ProductName, CompanyName, CategoryName
FROM northwind.products AS p
JOIN suppliers AS s
ON p.SupplierID = s.SupplierID
JOIN categories AS c
ON p.CategoryID = c.CategoryID;

10. **List all order items including order date, customer name, product name, and quantity.**
SELECT OrderDate, CompanyName, ProductName, Quantity
FROM northwind.orders AS o
JOIN `order details` AS od
ON o.OrderID = od.OrderID
JOIN customers AS c
ON o.CustomerID = c.CustomerID
JOIN products AS p
ON od.ProductID = p.ProductID;

## 🟠 **11–15: Joins with Filtering**
11. **List all orders placed by customers in Germany.**
SELECT OrderID, Country
FROM northwind.orders AS o
JOIN customers AS c
ON o.CustomerID = c.CustomerID
WHERE Country LIKE "Germany";

12. **Show all order details for products with unit price above 50.**
SELECT OrderID, od.ProductID, p.UnitPrice, Quantity, Discount
FROM northwind.`order details` AS od
JOIN products AS p
ON od.ProductID = p.ProductID
WHERE p.UnitPrice > 50;

13. **Find products from suppliers in the USA.**
SELECT CompanyName, Country
FROM northwind.products AS p
JOIN suppliers AS s
ON p.SupplierID = s.SupplierID
WHERE Country LIKE "USA";

14. **List all orders that include the product "Chai".**
SELECT OrderID
FROM northwind.`order details` AS od
JOIN products AS p
ON od.ProductID = p.ProductID
WHERE ProductName LIKE "Chai";

15. **Find customers who ordered products in the "Beverages" category.**
SELECT o.OrderID, CompanyName, ProductName, CategoryName
FROM northwind.orders AS o
JOIN `order details` AS od
ON o.OrderID = od.OrderID
JOIN customers AS c
ON o.CustomerID = c.CustomerID
JOIN products AS p
ON od.ProductID = p.ProductID
JOIN categories AS cat
ON p.CategoryID = cat.CategoryID
WHERE CategoryName LIKE "Beverages";

## 🔵 **16–20: Joins with Aggregates and `GROUP BY`**
16. **Show total quantity ordered per product.**
SELECT ProductName, COUNT(Quantity) AS TotalOrdered
FROM northwind.products AS p
JOIN `order details` AS od
ON p.ProductID = od.ProductID
GROUP BY ProductName;

17. **Find how many orders each customer has placed.**
SELECT CompanyName, COUNT(o.OrderID) AS NrOfTotalOrders
FROM northwind.orders AS o
JOIN customers AS c
ON o.CustomerID = c.CustomerID
GROUP BY CompanyName;

18. **List the number of products supplied by each supplier.**
SELECT CompanyName, COUNT(ProductID) AS NrOfProductsSupplied
FROM northwind.products AS p
JOIN suppliers AS s
ON p.SupplierID = s.SupplierID
GROUP BY CompanyName;

19. **For each category, show the average unit price of its products.**


20. **Show the total quantity of items ordered per customer.**


## 🟣 **21–25: Joins with Subqueries or `HAVING`**
21. **List customers who ordered more than 300 total items.**


22. **Show product names that were ordered more than 50 times in total.**


23. **Find the supplier of the most expensive product.**


24. **List the top 5 customers by total quantity ordered.**


25. **List the product(s) ordered in the highest-quantity single order.**
