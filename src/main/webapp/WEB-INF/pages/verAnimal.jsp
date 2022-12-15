<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<jsp:include page="layout/head.jsp">
  <jsp:param name="title" value="Ver animal"/>
</jsp:include>
<body>
<div class="layout">
  <jsp:include page="layout/header.jsp"/>
  <main class="main">
    <h1 class="main__title">Ver animal</h1>
    <div class="watch">
      <img class="form__img" id="form__img" src="${animalAVer.foto}"
           alt="">
      <div class="watch__content">
        <p class="watch__text">Nombre: ${animalAVer.nombre}</p>
        <p class="watch__text">Especie: ${animalAVer.especie}</p>
        <p class="watch__text">Raza: ${animalAVer.raza}</p>
        <p class="watch__text">Fecha de nacimiento: ${animalAVer.nacimiento}</p>
        <div class="group-buttons group-buttons--row">
          <a href="${pageContext.request.contextPath}/app"
             class="group-buttons__link group-buttons__link--exit group-buttons__link--w-100">Atras</a>
          <a href="${pageContext.request.contextPath}/app?action=edit&id=${animalAVer.idAnimal}"
             class="group-buttons__link group-buttons__link--modify group-buttons__link--w-100">Modificar</a>
        </div>
      </div>

    </div>
  </main>
  <jsp:include page="layout/footer.jsp"/>
</div>
</body>


</html>
