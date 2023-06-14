<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h3> Gun Name : <xsl:value-of select="gun/gunName"></xsl:value-of>
                <tr> ID : <xsl:value-of
                            select="gun/gunId"></xsl:value-of>
                    </tr>
                <tr> Caliber
        : <xsl:value-of select="gun/gunCaliber"></xsl:value-of>
                    </tr>
                <tr> Color : <xsl:value-of
                            select="gun/gunColor"></xsl:value-of>
                    </tr>
                <tr>
        Weight <xsl:value-of select="gun/gunWeight"></xsl:value-of>
                    </tr>
                </h3>
                <h2>Foregrip</h2>
                <table border="1">
                    <tr bgcolor="#aba3a2">
                        <th>ID</th>
                        <th>Name</th>
                    </tr>
                    <tr>
                        <td>
                            <xsl:value-of select="gun/foregrip/id" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/foregrip/foregripName" />
                        </td>
                    </tr>
                </table>
                <h2>Handguard</h2>
                <table border="1">
                    <tr bgcolor="#aba3a2">
                        <th>ID</th>
                        <th>Name</th>
                        <th>Weight</th>
                    </tr>
                    <tr>
                        <td>
                            <xsl:value-of select="gun/handguard/handguardId" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/handguard/handguardName" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/handguard/handguardWeight" />
                        </td>
                    </tr>

                </table>
                <h2>Magazine</h2>
                <table border="1">
                    <tr bgcolor="#aba3a2">
                        <th>ID</th>
                        <th>Name</th>
                        <th>Weight</th>
                        <th>Caliber</th>
                        <th>Capacity</th>
                    </tr>
                    <tr>
                        <td>
                            <xsl:value-of select="gun/magazine/magazineId" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/magazine/magazineName" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/magazine/magazineWeight" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/magazine/magazineCaliber" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/magazine/magazineCapacity" />
                        </td>
                    </tr>
                </table>
                <h2>Sights</h2>
                <table border="1">
                    <tr bgcolor="#aba3a2">
                        <th>ID</th>
                        <th>Name</th>
                        <th>Weight</th>
                        <th>Range</th>
                    </tr>
                    <xsl:for-each select="gun/sights">
                        <tr>
                            <td>
                                <xsl:value-of select="sightsId" />
                            </td>
                            <td>
                                <xsl:value-of select="sightsName" />
                            </td>
                            <td>
                                <xsl:value-of select="sightsWeight" />
                            </td>
                            <td>
                                <xsl:value-of select="sightingRange" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h2>Suppressor</h2>
                <table border="1">
                    <tr bgcolor="#aba3a2">
                        <th>ID</th>
                        <th>Name</th>
                        <th>Weight</th>
                        <th>Muzzle Velocity</th>
                    </tr>
                    <tr>
                        <td>
                            <xsl:value-of select="gun/suppressor/suppressorId" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/suppressor/suppressorName" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/suppressor/suppressorWeight" />
                        </td>
                        <td>
                            <xsl:value-of select="gun/suppressor/suppressorMuzzleVelocity" />
                        </td>
                    </tr>
                </table>
            </body>

        </html>

    </xsl:template>
</xsl:stylesheet>