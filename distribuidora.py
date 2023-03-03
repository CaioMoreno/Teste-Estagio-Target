import json

with open('dados.json') as json_file:
    dados_json = json.load(json_file)

dados = [dia["valor"] for dia in dados_json]

dados = [valor for valor in dados if valor > 0]

menorFaturamento = min(dados)
maiorFaturamento = max(dados)
soma = sum(dados)
acimaMedia = sum(1 for valor in dados if valor > soma / len(dados))

print(f"Menor faturamento diário: R${menorFaturamento:.2f}")
print(f"Maior faturamento diário: R${maiorFaturamento:.2f}")
print(f"Dias com faturamento diário superior à média mensal: {acimaMedia}")