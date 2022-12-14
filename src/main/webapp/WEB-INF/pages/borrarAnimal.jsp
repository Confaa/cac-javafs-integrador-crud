<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<jsp:include page="layout/head.jsp">
  <jsp:param name="title" value="Editar animal"/>
</jsp:include>
<body>
<div class="layout">
  <jsp:include page="layout/header.jsp"/>
  <main class="main">
    <form
        action="${pageContext.request.contextPath}/app?action=delete&id=${animalABorrar.idAnimal}"
        method="post" class="form">
      <div class="confirmation-delete">
        <img src="${animalABorrar.foto}" alt=""/>
        <span class="confirmation-delete__content">
      <p>Esta seguro que quiere borrar a ${animalABorrar.nombre}?</p>
      <span class="group-buttons group-buttons--row">

        <a href="${pageContext.request.contextPath}/app"
           class="group-buttons__link group-buttons__link--exit">No</a>
        <button type="submit"
                class="group-buttons__button group-buttons__button--register">Si</button>
      </span>
      </span>
      </div>
    </form>
  </main>
  <jsp:include page="layout/footer.jsp"/>
</div>
<script src="js/script.js"></script>
<script src="js/fotobase64.js"></script>
</body>


</html>