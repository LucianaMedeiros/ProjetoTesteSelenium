# Test api
# programa de criação json-server
# programa facil
# programa de test-api
# swagger / postman

# 1_ criar uma api facil para teste

# criei o arquivo aluno.json


{
"aluno":[
{
"id":1,
"nome":"thiago",
"disciplina":"teste",
"nota1":8,
"nota2":10,
"media":9,
"situacao":"aprovado"
},
{
"id":2,
"nome":"aline",
"disciplina":"teste",
"nota1":9,
"nota2":9,
"media":9,
"situacao":"aprovado"
},
{
"id":3,
"nome":"priscila",
"disciplina":"teste",
"nota1":8,
"nota2":8,
"media":8,
"situacao":"aprovado"
}
]
}

# ############

# Cliquei no Diretorio /direito / show in terminal

json-server aluno.json
Testes Realizados no Postman

# GET POSTMAN

pm.test("response is ok", function(){
      pm.response.to.have.status(200);
})

var aluno = pm.response.json();
pm.test("Verificar o Id", function(){
    pm.expect(aluno[0].id).is.to.equal(1);
})

pm.test("Verificar o Nome", function(){
    pm.expect(aluno[0].nome).is.to.equal("thiago");
})

  var jsonData = pm.response.json();
pm.test("Testar os Tipos", function(){
    pm.expect(jsonData[0].id).to.be.a("number");
    pm.expect(jsonData[0].nome).to.be.a("string");
})

  var jsonData = pm.response.json();
pm.test("Testar o Tamanho", function(){
    pm.expect(jsonData.length).to.be.greaterThan(2);
})

 
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});
 
pm.test("Corpo do Meu Json Existe :", function () {
    pm.expect(pm.response.text()).to.include("aline");
});


# GRAVACAO POST

pm.test("O Tempo está entre 10 milisegundos", function () {
    pm.expect(pm.response.responseTime).to.be.below(20);
});


var aluno = pm.response.json();
pm.test("Status de Gravacao :", function(){
     pm.response.to.have.status(200);
});

pm.test("Testando o Nome :", function(){
     pm.expect(aluno[0].nome).is.to.equal("luciana");
});

pm.test("Testando ID :", function(){
     pm.expect(aluno[0].id).is.to.equal(10);
});




 