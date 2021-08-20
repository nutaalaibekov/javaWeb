<html>
<body>
<h2><%! int i = 2; %></h2>
<h2><%= 1 + 2 + 3 %>></h2>
<%
    for(int j = 0; j < 10; j++) {
%>
<h2><%= j %></h2>
<%
    }
%>

</body>
</html>
