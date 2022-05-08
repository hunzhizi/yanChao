<%@page language="java" %>

<%!
    int add(int x, int y) {
        return x + y;
    }
%>
<html>
<body>
<h2>sum of two</h2>
</body>

<%
    int a = 1;
    int b = 1;
    int c = add(a, b);
%>

sum = <%=c%>

</html>
