using System;

namespace calculo
{
    class Program
    {
        static void Main(string[] args)
        {
            console.WriteLine("Digite o valor do seu salário: ");
            float valorSalario = float.Parse(Console.ReadLine());
            console.WriteLine("Digite o valor dos benefícios: ");
            float valorBeneficios = float.Parse(Console.ReadLine());

            float valorImposto = 0;

            if (valorSalario >= 0 && valorSalario <= 1100)
            {
                valorImposto = 0.05f * valorSalario;
            }
            else if (valorSalario >= 1100.01f && valorSalario <= 2500)
            {
                valorImposto = 0.1f * valorSalario;
            }
            else
            {
                valorImposto = 0.15f * valorSalario;
            }
            float saida = valorSalario - valorImposto + valorBeneficios;
            console.WriteLine("Salário líquido: " + saida.ToString("F2"));
        }
    }
}