const btn = document.getElementById("btnDescarga");
const progreso = document.getElementById("progreso");
const texto = document.getElementById("texto");
const humo = document.getElementById("humo");

btn.addEventListener("click", () => {
    btn.classList.add("cargando");
    humo.style.display = "block";
    texto.textContent = "Descargando...";

    let progresoActual = 0;
    const intervalo = setInterval(() => {
    progresoActual += 2;
    progreso.style.width = `${progresoActual}%`;

    if (progresoActual >= 100) {
        clearInterval(intervalo);
        humo.style.display = "none";
        progreso.style.width = "100%";
        btn.classList.remove("cargando");
        btn.classList.add("finalizado");
        texto.textContent = "Completado";
    }
    }, 100);
});