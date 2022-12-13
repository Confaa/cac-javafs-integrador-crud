<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<jsp:include page="layout/head.jsp">
  <jsp:param name="title" value="Animales"/>
</jsp:include>
<body>
<div class="layout">
  <jsp:include page="layout/header.jsp"/>
  <main class="main"><h1 class="main__title">Listado de Animales</h1>
    <div class="group-buttons">
      <button class="group-buttons__button group-buttons__button--register">
        Agregar Motor
      </button>
    </div>
    <div class="main__content-cards">
      <c:choose>
        <c:when test="${listaAnimales !=null && !listaAnimales.isEmpty()}">
          <c:forEach items="${listaAnimales}" var="animal">
            <jsp:include page="components/card.jsp">
              <jsp:param name="nombre" value="${animal.getNombre()}"/>
              <jsp:param name="especie" value="${animal.getEspecie()}"/>
              <jsp:param name="id" value="${animal.getIdAnimal()}"/>
            </jsp:include>
          </c:forEach>
        </c:when>
        <c:otherwise>
          <p>No hay animales que mostrar</p>
        </c:otherwise>
      </c:choose>
    </div>
  </main>
  <jsp:include page="layout/footer.jsp"/>
</div>
</body>
</html>