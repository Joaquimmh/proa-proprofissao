        function limpa_formulário_cep() {
                //Limpa valores do formulário de cep.
                document.getElementById('rua').value=("");
                document.getElementById('bairro').value=("");
                document.getElementById('cidade').value=("");
                document.getElementById('uf').value=("");
        }
    
        function meu_callback(conteudo) {
            if (!("erro" in conteudo)) {
                //Atualiza os campos com os valores.
                document.getElementById('rua').value=(conteudo.logradouro);
                document.getElementById('bairro').value=(conteudo.bairro);
                document.getElementById('cidade').value=(conteudo.localidade);
                document.getElementById('uf').value=(conteudo.uf);
            } //end if.
            else {
                //CEP não Encontrado.
                limpa_formulário_cep();
                alert("CEP não encontrado.");
            }
        }
            
        function pesquisacep(valor) {
    
            //Nova variável "cep" somente com dígitos.
            var cep = valor.replace(/\D/g, '');
    
            //Verifica se campo cep possui valor informado.
            if (cep != "") {
    
                //Expressão regular para validar o CEP.
                var validacep = /^[0-9]{8}$/;
    
                //Valida o formato do CEP.
                if(validacep.test(cep)) {
    
                    //Preenche os campos com "..." enquanto consulta webservice.
                    document.getElementById('rua').value="...";
                    document.getElementById('bairro').value="...";
                    document.getElementById('cidade').value="...";
                    document.getElementById('uf').value="...";    
                    //Cria um elemento javascript.
                    var script = document.createElement('script');
    
                    //Sincroniza com o callback.
                    script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';
    
                    //Insere script no documento e carrega o conteúdo.
                    document.body.appendChild(script);
    
                } //end if.
                else {
                    //cep é inválido.
                    limpa_formulário_cep();
                    alert("Formato de CEP inválido.");
                }
            } //end if.
            else {
                //cep sem valor, limpa formulário.
                limpa_formulário_cep();
            }
        };
        function naturalidade(uf) {
            switch (uf) {
                case "AC":
                    document.getElementById("naturalidade").value = "Acreano";
                    break;
                case "AL":
                    document.getElementById("naturalidade").value = "Alagoano";
                    break;
                case "AP":
                    document.getElementById("naturalidade").value = "Amapaense";
                    break;
                case "AM":
                    document.getElementById("naturalidade").value = "Amazonense";
                    break;
                case "BA":
                    document.getElementById("naturalidade").value = "Baiano";
                    break;
                case "CE":
                    document.getElementById("naturalidade").value = "Cearense";
                    break;
                case "DF":
                    document.getElementById("naturalidade").value = "Brasiliense";
                    break;
                case "ES":
                    document.getElementById("naturalidade").value = "Capixaba";
                    break;
                case "GO":
                    document.getElementById("naturalidade").value = "Goiano";
                    break;
                case "MA":
                    document.getElementById("naturalidade").value = "Maranhense";
                    break;
                case "MT":
                    document.getElementById("naturalidade").value = "Mato Grossense";
                    break;
                case "MS":
                    document.getElementById("naturalidade").value = "Sul Mato Grossense";
                    break;
                case "MG":
                    document.getElementById("naturalidade").value = "Mineiro";
                    break;
                case "PA":
                    document.getElementById("naturalidade").value = "Paraense";
                    break;
                case "PB":
                    document.getElementById("naturalidade").value = "Paraibano";
                    break;
                case "PR":
                    document.getElementById("naturalidade").value = "Paranaense";
                    break;
                case "PE":
                    document.getElementById("naturalidade").value = "Pernambucano";
                    break;
                case "PI":
                    document.getElementById("naturalidade").value = "Piauiense";
                    break;
                case "RJ":
                    document.getElementById("naturalidade").value = "Fluminense";
                    break;
                case "RN":
                    document.getElementById("naturalidade").value = "Potiguar";
                    break;
                case "RO":
                    document.getElementById("naturalidade").value = "Rondoniano";
                    break;
                case "RR":
                    document.getElementById("naturalidade").value = "Roraimense";
                    break;
                case "RS":
                    document.getElementById("naturalidade").value = "Gaúcho";
                    break;
                case "SC":
                    document.getElementById("naturalidade").value = "Catarinense";
                    break;
                case "SP":
                    document.getElementById("naturalidade").value = "Paulista";
                    break;
                case "SE":
                    document.getElementById("naturalidade").value = "Sergipano";
                    break;
                case "TO":
                    document.getElementById("naturalidade").value = "Tocantinense";
                    break;
                default:
                    document.getElementById("naturalidade").value = "Estado ou CEP Inválido";
            }
        }