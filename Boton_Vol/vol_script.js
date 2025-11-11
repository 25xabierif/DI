const tempRange = document.getElementById('tempRange');
const tempValue = document.getElementById('tempValue');
const rellenar = document.getElementById('rellenar');
const porcentaje = document.getElementById('porcentaje');
const olla = document.querySelector('.olla');

let targetVolume = 0;
let volActual = 0;
let currentTemp = 0;

let hervir = false;

// Actualiza el volumen con retardo
function animarVol() {
    volActual += (targetVolume - volActual) * 0.05;

    const red = Math.round(volActual * 2.55);
    const blue = Math.round(255 - volActual * 2.55);
    const color = `linear-gradient(to top, rgb(${red}, 0, ${blue}), red)`;

    rellenar.style.height = `${volActual}%`;
    rellenar.style.background = color;
    porcentaje.textContent = `Vol: ${Math.round(volActual)}`;



    if(volActual > 99 && !hervir){
    hervir = true;
    const notyf = new Notyf({
        duration: 3000,
        position: { x: 'right', y: 'top' }
    });
    notyf.success('¡El volumen está al máximo!');
    }
    if(volActual < 90 && hervir){
    hervir = false;
    }

    requestAnimationFrame(animarVol);
}

animarVol();

// Control de temperatura
tempRange.addEventListener('input', () => {
    currentTemp = parseInt(tempRange.value);
    tempValue.textContent = `${currentTemp}°C`;
    targetVolume = Math.min(100, currentTemp);
})