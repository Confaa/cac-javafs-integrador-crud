<span class="card">
            <img class="card__img" src="${param.foto}" alt=""/>
            <span class="card__content">
              <h2 class="card__title">${param.nombre}</h2>
              <p class="card__species">${param.especie}</p>
                <span class="group-buttons group-buttons--row">
              <a
                  class="group-buttons__button group-buttons__button--watch group-buttons__button--w-100"
                  href="${pageContext.request.contextPath}/app?action=watch&id=${param.id}"
              >
                Ver
              </a>
              <a
                  class="group-buttons__button group-buttons__button--modify group-buttons__button--w-100"
                  href="${pageContext.request.contextPath}/app?action=edit&id=${param.id}"
              >
                Modificar
              </a>
                <a
                    class="group-buttons__button group-buttons__button--delete group-buttons__button--w-100"
                    href="${pageContext.request.contextPath}/app?action=remove&id=${param.id}"
                >
                Borrar
              </a>
            </span>
            </span>

          </span>
