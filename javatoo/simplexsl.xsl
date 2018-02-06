<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/people">
<html>
    <head>
        <link rel="stylesheet" href="main.css"/>
    </head>
<body>
    <h1>Inimeste nimekiri</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>ID</th>
            <th>Phone</th>
            <th>Address</th>
        </tr>
        <xsl:for-each select="person">
        <tr>
            <td><xsl:value-of select="name" /></td>
            <td><xsl:value-of select="ID" /></td>
            <td><xsl:value-of select="phone" /></td>
            <td><xsl:value-of select="address" /></td>
        </tr>
        </xsl:for-each>
    </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>