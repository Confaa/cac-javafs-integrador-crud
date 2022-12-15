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
    <h1 class="main__title">Editar animal</h1>
    <form
        action="${pageContext.request.contextPath}/app?action=update&id=${animalAEditar.idAnimal}"
        method="post" id="form-agregar-editar" class="form">

      <div class="form__layout">
        <div class="form__img-contain">
          <img class="form__img" id="form__img" src="${animalAEditar.foto}"
               alt="">
        </div>
        <div class="form__group-inputs">
      <span class="form__label-input">
      <label for="nombre">Nombre: </label>
      <input type="text" name="nombre" id="nombre"
             value="${animalAEditar.nombre}"/>
        </span>
          <span class="form__label-input">
      <label for="especie">Especie: </label>
      <input type="text" name="especie" id="especie"
             value="${animalAEditar.especie}"/>
        </span>
          <span class="form__label-input">
      <label for="raza">Raza: </label>
      <input type="text" name="raza" id="raza"
             value="${animalAEditar.raza}"/>
        </span>
          <span class="form__label-input">
      <label for="nacimiento">Fecha de nacimiento: </label>
      <input type="text" name="nacimiento" id="nacimiento"
             value="${animalAEditar.nacimiento}"/>
        </span>
          <input class="form__input" id="file" type="file" accept="image/*"/>
          <input type="hidden" id="fotoBase64" name="fotoBase64"
                 value="${animalAEditar.foto}"/>
          <span class="group-buttons group-buttons--row"><a
              href="${pageContext.request.contextPath}/app"
              class="group-buttons__link group-buttons__link--exit group-buttons__button--w-100">Atras</a>
            <button
                type="submit"
                class="group-buttons__button group-buttons__button--register group-buttons__button--w-100">Guardar</button></span>
        </div>
      </div>
    </form>

  </main>
  <jsp:include page="layout/footer.jsp"/>
</div>
<script src="js/script.js"></script>
<script src="js/fotobase64.js"></script>
</body>


</html>
