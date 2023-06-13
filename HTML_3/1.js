'use strict';

function convertCelsiusToFahrenheit(temperature) {
    return  Math.round((1.8 * temperature + 32) * 100) / 100;
}

const tempCelsius = Number.parseFloat(prompt('Введите температуру в градусах Цельсия'));
const tempFahrenheit = convertCelsiusToFahrenheit(tempCelsius);

alert(`Цельсий: ${tempCelsius} Фаренгейт: ${tempFahrenheit}`);