<!DOCTYPE html>
<html lang="es">
<jsp:include page="WEB-INF/pages/layout/head.jsp">
    <jsp:param name="title" value="CRUD - Codo a Codo 4.0 Java FullStack"/>
</jsp:include>

<body>
<div class="layout">
    <jsp:include page="WEB-INF/pages/layout/header.jsp"/>
    <main class="main">
        <h1>WebApp Java MVC con base de datos MariaDB</h1>
        <div class="group-buttons--row"><a
                href="${pageContext.request.contextPath}/app"
                class="group-buttons__button group-buttons__button--register">Ir
            a la app</a></div>
    </main>
    <jsp:include page="WEB-INF/pages/layout/footer.jsp"/>
</div>
</body>
</html>
