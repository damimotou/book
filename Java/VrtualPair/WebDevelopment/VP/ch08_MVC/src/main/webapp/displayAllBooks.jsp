<%@ page import = "java.util.List" %>
<%@ page import = "ua.mega.domain.Book" %>
<% List<Book> allBooks = (List<Book>)request.getAttribute("allBooks"); %>

<html>

<head>
	<title>All books for our store</title>
	<link href="styles.css" rel="Stylesheet" type="text/css"/>
</head>
  
<body>

	<jsp:include page="/header.jsp"/>
	
	<div id="books">
		<ul>
			
			<% 
			   for (Book nextBook : allBooks)
			   {
			%>
			
			<li>
				<h2><%= nextBook.getTitle() %></h2>
				<p>
					<span> by  <%= nextBook.getAuthor() %>  
					       $<%= nextBook.getPrice() %>			
				
					<form method='post' action='AddToCart.html'>
						<input type='hidden' name='id' value='<%= nextBook.getId() %>'/>
						<input type='image' src='cart-button.png'/>
				    </form>
				</span>
				</p>
				
			</li>
			
			<%
			   }
			%>
		
		</ul>
	</div>
		
	<jsp:include page="/footer.jsp"/>
	
</body>

</html>