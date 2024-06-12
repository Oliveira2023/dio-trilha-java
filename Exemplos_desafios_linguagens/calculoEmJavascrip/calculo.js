const valorSalario = 2000;
const valorBeneficios = 250;

const valorImposto = () => {
    
    let aliquota = 0;
    if(valorSalario > 0 && valorSalario <= 1100) {
        aliquota = 0.05;
    }else if (valorSalario > 1100 && valorSalario <= 2500) {
        aliquota = 0.1;
    }else {
        aliquota = 0.15;
    }
    return aliquota * valorSalario;
}

const saida = valorSalario - valorImposto() + valorBeneficios;

console.log(`Seu salário liquido é de R$ ${saida.toFixed(2)}`);