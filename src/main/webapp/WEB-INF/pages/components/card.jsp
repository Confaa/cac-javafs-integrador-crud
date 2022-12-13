<span class="card">
            <img class="card__img" src="https://picsum.photos/1000" alt=""/>
            <span class="card__content">
              <h2 class="card__title">${param.nombre}</h2>
              <p class="card__species">${param.especie}</p>
                <span class="group-buttons group-buttons--row">
              <a
                  class="group-buttons__button group-buttons__button--watch"
                  href="${pageContext.request.contextPath}/app"
              >
                Ver
              </a>
              <a
                  class="group-buttons__button group-buttons__button--modify"
                  href="${pageContext.request.contextPath}/app?action=edit&id=${param.id}"
              >
                Modificar
              </a>
                <a
                    class="group-buttons__button group-buttons__button--delete"
                    href="${pageContext.request.contextPath}/app?action=remove&id=${param.id}"
                >
                Borrar
              </a>
            </span>
            </span>

          </span>
