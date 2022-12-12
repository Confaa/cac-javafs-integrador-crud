<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<jsp:include page="layout/head.jsp">
  <jsp:param name="title" value="Animales"/>
</jsp:include>
<body>
<div class="layout">
  <jsp:include page="layout/header.jsp"/>
  <main class="main"><h1 class="main__title">Listado de Motores</h1>
    <div class="group-buttons">
      <button class="group-buttons__button group-buttons__button--register">
        Agregar Motor
      </button>
    </div>
    <div class="main__content-cards">
      <c:whe>
        <c:when test="${listaAnimales !=null && !listaAnimales.isEmpty()}">
          <c:forEach items="${listaAnimales}" var="animal">

            <jsp:include page="components/card.jsp">
              <jsp:param name="${animal.getNombre()}"/>
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