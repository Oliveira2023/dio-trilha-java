
def calcular_impostos(salario):
    aliquota = 0.00
    if (salario >= 0 and salario <= 1100):
        aliquota = 0.005
    elif (salario > 1100 and salario <= 2500):
        aliquota = 0.10
    elif (salario > 2500):
        aliquota = 0.15
    return (salario * aliquota)

valorSalario = float(input("Digite o valor do seu salário: "))
valorBeneficios = float(input("Digite o valor dos seus benefícios: "))

valorImposto = calcular_impostos((valorSalario))

saida = (valorSalario - valorImposto) + valorBeneficios

print(f"Salário líquido: {saida:.2f}")
    