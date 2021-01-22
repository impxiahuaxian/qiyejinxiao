<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true"%>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>error</title>
</head>
<body>
<pre>
    <%
        Enumeration<String> attributeNames = request.getAttributeNames();
        while (attributeNames.hasMoreElements())
        {
            String attributeName = attributeNames.nextElement();
            Object attribute = request.getAttribute(attributeName);
            out.println("request.attribute['" + attributeName + "'] = " + attribute);
        }
    %>
    <%
        response.getWriter().println("Exception: " + exception);

        if(exception != null)
        {
            response.getWriter().println("<pre>");
            exception.printStackTrace(response.getWriter());
            response.getWriter().println("</pre>");
        }

        response.getWriter().println("<hr/>");
    %>
</pre>
</body>
</html>
