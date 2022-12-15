<!DOCTYPE html>
<html lang="es">
<jsp:include page="WEB-INF/pages/layout/head.jsp">
  <jsp:param name="title" value="CRUD - Codo a Codo 4.0 Java FullStack"/>
</jsp:include>

<body>
<div class="layout">
  <jsp:include page="WEB-INF/pages/layout/header.jsp"/>
  <main class="main main--index">
    <h1 class="main__title">WebApp Java MVC con base de datos MySQL</h1>
    <p class="main__description">Este es un CRUD (Create, Read, Update, Delete) creado como proyecto final
      para el curso Codo a Codo 4.0 Java FullStack</p>
    <h3>Definición de la base de datos:</h3>
    <img class="main__img" src="img/baseDatos.png" alt="">
    <div class="group-buttons--row"><a
        href="${pageContext.request.contextPath}/app"
        class="group-buttons__button group-buttons__button--register">Ir
      a la app</a></div>
  </main>
  <jsp:include page="WEB-INF/pages/layout/footer.jsp"/>
</div>
</body>
</html>
