function closeButton() {
    var btn = document.getElementsByClassName("close-pop")
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");

    if(btn[0]) {
        popErrado.style.display = "none";
    }if(btn[1]) {
        popCerto.style.display = "none";
    }
}


function Q1A() {
    
    var opA = document.getElementById("opA");
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");

    if (opA.checked==true) { // Opção correta
        respostaCorreta.innerHTML = 'A resposta é: "As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I."';
        popCerto.style.display = "block"
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I."'
        popErrado.style.display = "block";
    }
}


function Q2A() {
    var opC = document.getElementById("opC");
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");

    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I e III, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "I e III, apenas."';
        popErrado.style.display = "block";
    }
}

function Q3A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opE = document.getElementById("opE");

    if (opE.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "tendência a desequilíbrio gradual e contínuo da sustentabilidade do planeta."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "tendência a desequilíbrio gradual e contínuo da sustentabilidade do planeta."';
        popErrado.style.display = "block";
    }
}

function Q4A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opB = document.getElementById("opB");

    if (opB.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "empresas e instituições estão atentas ao comportamento de seus funcionários em websites de redes sociais."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "empresas e instituições estão atentas ao comportamento de seus funcionários em websites de redes sociais."';
        popErrado.style.display = "block";
    }
}

function Q5A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opD = document.getElementById("opD");

    if (opD.checked==true) {
        respostaCorreta.innerHTML = ' A resposta é: "I, III e IV."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "I, III e IV."';
        popErrado.style.display = "block";
    }
}

function Q6A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opC = document.getElementById("opC");

    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A resposta correta é: "I e II, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "I e II, apenas."';
        popErrado.style.display = "block";
    }
}

function Q7A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opE = document.getElementById("opE");

    if (opE.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: I, II e III.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: I, II e III.';
        popErrado.style.display = "block";
    }
}

function Q8A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opD = document.getElementById("opD");

    if (opD.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: tanto o espaço urbano quanto o rural sofreram transformações decorrentes da aplicação de novas tecnologias às atividades industriais e agrícolas.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: tanto o espaço urbano quanto o rural sofreram transformações decorrentes da aplicação de novas tecnologias às atividades industriais e agrícolas.';
        popErrado.style.display = "block";
    }
}

function Q9A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opA = document.getElementById("opA");

    if (opA.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: devem ser inseridas no planejamento do projeto, uma vez que a empresa é a responsável pela implantação do software (a terceirização foi uma opção da própria empresa).';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: devem ser inseridas no planejamento do projeto, uma vez que a empresa é a responsável pela implantação do software (a terceirização foi uma opção da própria empresa).';
        popErrado.style.display = "block";
    }
}

function Q10A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opC = document.getElementById("opC");

    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A respostas é: A asserção I é uma proposição verdadeira, e a II é uma proposição falsa.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: A asserção I é uma proposição verdadeira, e a II é uma proposição falsa.';
        popErrado.style.display = "block";
    }
}

function Q11A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opA = document.getElementById("opA");

    if (opA.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é a alternativa A.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é a alternativa A.';
        popErrado.style.display = "block";
    }
}

function Q12A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opC = document.getElementById("opC");

    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "Plano de contingência."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "Plano de contingência."';
        popErrado.style.display = "block";
    }
}

function Q13A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opB = document.getElementById("opB");

    if (opB.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I."';
        popErrado.style.display = "block";
    }
}

function Q14A() {

    var opA = document.getElementById("opA");
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");

    if (opA.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "I, apenas."';
        popErrado.style.display = "block";
    }
}

function Q15A() {

    var opA = document.getElementById("opA");
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");

    if (opA.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "A resposta é: "A transparência entre as entidades do sistema."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "A resposta é: "A transparência entre as entidades do sistema."';
        popErrado.style.display = "block";
    }
}

function Q16A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opC = document.getElementById("opC");
    
    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "13."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "13."';
        popErrado.style.display = "block";
    }
}

function Q17A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opB = document.getElementById("opB");

    if (opB.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I e IV."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "I e IV."';
        popErrado.style.display = "block";
    }
}

function Q18A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opC = document.getElementById("opC");

    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I e II, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "I e II, apenas."';
        popErrado.style.display = "block";
    }
}

function Q19A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opB = document.getElementById("opB");

    if (opB.checked==true) {
        respostaCorreta.innerHTML = 'A resposta correta é: "III, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "III, apenas."';
        popErrado.style.display = "block";
    }
}

function Q20A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opD = document.getElementById("opD");

    if (opD.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "0,3,1,5,7,8,2"';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "0,3,1,5,7,8,2"';
        popErrado.style.display = "block";
    }
}

function Q21A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opA = document.getElementById("opA");

    if (opA.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I, II e III."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "I, II e III."';
        popErrado.style.display = "block";
    }
}

function Q22A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opE = document.getElementById("opE");

    if (opE.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "restrições de integridade semântica."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "restrições de integridade semântica."';
        popErrado.style.display = "block";
    }
}

function Q23A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opD = document.getElementById("opD");

    if (opD.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "II e III, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: "A resposta correta é: "II e III, apenas."';
        popErrado.style.display = "block";
    }
}

function Q24A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opB = document.getElementById("opB");

    if (opB.checked==true) {
        respostaCorreta.innerHTML = 'A resposta correta é: Na fase de Elaboração, no fluxo de Análise e Design.';
        popCerto.style.display = "block";
        
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: Na fase de Elaboração, no fluxo de Análise e Design.';
        popErrado.style.display = "block";
    }
}

function Q25A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opC = document.getElementById("opC");

    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: Usabilidade, segurança, desempenho e confiabilidade.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta é: Usabilidade, segurança, desempenho e confiabilidade.';
        popErrado.style.display = "block";
    }
}

function Q26A() {
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opD = document.getElementById("opD");

    if (opD.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: I, III e IV.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: I, III e IV.';
        popErrado.style.display = "block";
    }
}

function Q27A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opE = document.getElementById("opE");

    if (opE.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: 8 e 8.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: 8 e 8.';
        popErrado.style.display = "block";
    }
}

function Q28A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opE = document.getElementById("opE");

    if (opE.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: I, II e III.';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: I, II e III.';
        popErrado.style.display = "block";
    }
}

function Q29A() {

    var opA = document.getElementById("opA");
    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");

    if (opA.checked==true) {
        respostaCorreta.innerHTML = 'A opção correta era alternativa A';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A opção correta era alternativa A';
        popErrado.style.display = "block";
    }
}

function Q30A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opD = document.getElementById("opD");

    if (opD.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "II e III, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "II e III, apenas."';
        popErrado.style.display = "block";
    }
}

function Q31A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opC = document.getElementById("opC");

    if (opC.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I e II, apenas."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "I e II, apenas."';
        popErrado.style.display = "block";
    }
}

function Q32A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opE = document.getElementById("opE");

    if (opE.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I, II e III."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "I, II e III."';
        popErrado.style.display = "block";
    }
}

function Q33A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opB = document.getElementById("opB");

    if (opB.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "I,II e IV."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "I,II e IV."';
        popErrado.style.display = "block";
    }
}

function Q34A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opD = document.getElementById("opD");

    if (opD.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "20 dias."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "20 dias."';
        popErrado.style.display = "block";
    }
}

function Q35A() {

    var popCerto = document.getElementById("pop-certo");
    var popErrado = document.getElementById("pop-errado");
    var respostaCorreta = document.getElementById("correta");
    var respostaErrada = document.getElementById("errada");
    var opB = document.getElementById("opB");

    if (opB.checked==true) {
        respostaCorreta.innerHTML = 'A resposta é: "o time X venceu o último jogo e o time Y não é campeão."';
        popCerto.style.display = "block";
    }
    else {
        respostaErrada.innerHTML = 'A resposta correta é: "o time X venceu o último jogo e o time Y não é campeão."';
        popErrado.style.display = "block";
    }
}
