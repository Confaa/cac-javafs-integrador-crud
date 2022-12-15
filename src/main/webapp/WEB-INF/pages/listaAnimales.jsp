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
  <main class="main main--others"><h1 class="main__title">Listado de Animales</h1>
    <c:choose>
      <c:when test="${listaAnimales !=null && !listaAnimales.isEmpty()}">
        <div class="main__content-cards">
          <c:forEach items="${listaAnimales}" var="animal">
            <jsp:include page="components/card.jsp">
              <jsp:param name="nombre" value="${animal.getNombre()}"/>
              <jsp:param name="especie" value="${animal.getEspecie()}"/>
              <jsp:param name="id" value="${animal.getIdAnimal()}"/>
              <jsp:param name="foto" value="${animal.getFoto()}"/>
            </jsp:include>
          </c:forEach>
        </div>
      </c:when>
      <c:otherwise>
        <p class="main__no-animals">No hay animales que mostrar</p>
      </c:otherwise>
    </c:choose>
    <div class="group-buttons">
      <a href="${pageContext.request.contextPath}/app?action=create"
         class="group-buttons__link group-buttons__link--register">
        Agregar animal
      </a>
    </div>
  </main>
  <jsp:include page="layout/footer.jsp"/>
</div>
</body>
</html>