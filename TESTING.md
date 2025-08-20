# 🇧🇷 Introdução
Esse arquivo visa instruir sobre os testes manuais realizados solicitados no README do projeto, 
eles foram realizados através do Postman, a coleção utilizada pode ser encontrada para ser importada [aqui](./manual-tests-places.postman_collection.json).

Abaixo há uma descrição dos cenários de testes realizados, os passos necessários para realizá-los e seus respectivos resultados esperado e obtido, 
como pré-requisito geral, o projeto foi iniciado com o comando ```mvn spring-boot:run```.

## Cenário 1: Cadastro de um novo item
**Passos necessários**
1. Preencher o Body com um JSON válido contendo name, slug, city e state;
2. Enviar uma requisição POST para /places.

**Resultado esperado**
- Criar um novo item com os parâmetros informados;
- Retornar um JSON contendo o item recém criado.

**Resultado obtido**
- [OK] Item criado;
- [OK] Retornado corretamente.

## Cenário 2: Listar todos os items
**Passos necessários**
1. Enviar uma requisição GET para /places.

**Resultado esperado**
- Retornar um JSON contendo todos os items criados até o momento.

**Resultado obtido**
- [OK] Retornado corretamente.

## Cenário 3: Listar todos os items a partir de um nome
**Passos necessários**
1. Enviar uma requisição GET para /places?name={nome}.

**Resultado esperado**
- Retornar um JSON contendo somente items que possuam _name_ igual ao informado via parâmetro.

**Resultado obtido**
- [OK] Retornado corretamente.

## Cenário 4: Erro 404 deve ser retornado caso não haja item com nome igual ao informado via parâmetro
**Passos necessários**
1. Enviar uma requisição GET para /places?name={nome-não-existente}.

**Resultado esperado**
- Erro 404 é retornado, indicando que o item não foi encontrado.

**Resultado obtido**
- [OK] Erro 404 retornado.

## Cenário 5: Obter item através do id
**Passos necessários**
1. Enviar uma requisição GET para /places/{id}.

**Resultado esperado**
- Retornar um JSON contendo o item associado ao id informado.

**Resultado obtido**
- [OK] Retornado corretamente.

## Cenário 6: Erro 404 deve ser retornado caso não haja item associado com o id informado
**Passos necessários**
1. Enviar uma requisição GET para /places/{id-não-existente}.

**Resultado esperado**
- Erro 404 é retornado, indicando que o item não foi encontrado.

**Resultado obtido**
- [OK] Erro 404 retornado.

## Cenário 7: Item deve ser atualizado
**Passos necessários**
1. Preencher o Body com um JSON válido contendo name, slug, city e state;
2. Enviar uma requisição PUT para /places/{id}.

**Resultado esperado**
- Retornar um JSON contendo o item pós-atualização.

**Resultado obtido**
- [OK] Retornado corretamente.

## Cenário 8: Erro 404 deve ser retornado caso não haja item associado com o id informado
**Passos necessários**
1. Preencher o Body com um JSON válido contendo name, slug, city e state;
2. Enviar uma requisição PUT para /places/{id-não-existente}.

**Resultado esperado**
- Erro 404 é retornado, indicando que o item não foi encontrado.

**Resultado obtido**
- [OK] Erro 404 retornado.

---

# 🇺🇸 Introduction
This file intends to instruct about manual tests performed that were requested on project's README, tests were validated using
Postman, collection used can be found [here](./manual-tests-places.postman_collection.json) for import.

Bellow there is a description for each test case performed, required steps for accomplish and their respective expected and obtained result,
as general prerequisite, project was initialized with command ```mvn spring-boot:run```.

## Scenario 1: Submit a new item
**Required steps**
1. Fill in Body with a valid JSON containing name, slug, city and state;
2. Send a POST request to /places.

**Expected result**
- Create a new item with parameters given;
- Return a JSON that contains brand-new item.

**Obtained Result**
- [OK] Item created;
- [OK] Returned correctly.

## Scenario 2: List all items
**Required steps**
1. Send a GET request to /places.

**Expected result**
- Return a JSON that contains all item created up to now.

**Obtained Result**
- [OK] Returned correctly.

## Scenario 3: List all items through a name 
**Required steps**
1. Send a GET request to /places?name={name}.

**Expected result**
- Return a JSON that contains only items with name equal to given parameter.

**Obtained Result**
- [OK] Returned correctly.

## Scenario 4: Error 404 must be returned if there is no item with name equals to parameter given
**Required steps**
1. Send a GET request to /places?name={non-existent-name}.

**Expected result**
- Error 404 is returned, suggesting that no item was found.

**Obtained Result**
- [OK] Error 404 returned.

## Scenario 5: Get item by id
**Required steps**
1. Send a GET request to /places/{id}.

**Expected result**
- Return a JSON that contains item associated to given id.

**Obtained Result**
- [OK] Returned correctly.

## Scenario 6: Error 404 must be returned if no item is associated with given id
**Required steps**
1. Send a GET request to /places/{non-existent-id}.

**Expected result**
- Error 404 is returned, suggesting that no item was found.

**Obtained Result**
- [OK] Error 404 returned.

## Scenario 7: Item must be updated
**Required steps**
1. Fill in Body with a valid JSON containing name, slug, city and state;
2. Send a PUT request to /places/{id}.

**Expected result**
- Return a JSON that contains post-updated item.

**Obtained result**
- [OK] Returned correctly.

## Scenario 8: Error 404 must be returned if no item is associated with given id
**Required steps**
1. Fill in Body with a valid JSON containing name, slug, city and state;
2. Send a PUT request to /places/{non-existent-id}.

**Expected result**
- Error 404 is returned, suggesting that no item was found.

**Obtained result**
- [OK] Error 404 returned.
