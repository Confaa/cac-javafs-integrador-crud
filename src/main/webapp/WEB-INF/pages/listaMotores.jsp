<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<jsp:include page="../pages/layout/head.jsp">
    <jsp:param name="title" value="Motores"/>
</jsp:include>
<body>
<div class="container">
    <jsp:include page="layout/header.jsp"/>
    <main class="main"><h1 class="main__title">Listado de Motores</h1>
        <div class="group-buttons">
            <button class="group-buttons__button group-buttons__button--register">
                Agregar Motor
            </button>
        </div>
        <div class="main__content-cards">
          <span class="card">
            <img class="card__img" src="https://picsum.photos/1000" alt=""/>
            <span class="card__content">
              <h2 class="card__title">Hola mundo!</h2>
            </span>
            <span class="group-buttons group-buttons--row">
              <button
                      class="group-buttons__button group-buttons__button--delete"
              >
                Borrar
              </button>
              <button
                      class="group-buttons__button group-buttons__button--modify"
              >
                Modificar
              </button>
            </span>
          </span>
        </div></main>
    <jsp:include page="/layout/footer.jsp"/>
</div>
</body>
</html>