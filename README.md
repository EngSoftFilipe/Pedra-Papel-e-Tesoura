# 🪨📄✂️ Jokempô em Java

Um jogo simples e divertido de **Pedra, Papel e Tesoura**, desenvolvido em **Java**, com interação direta no console.  

---

## 🎮 Como funciona

O jogador informa o **nome**, escolhe entre:

- `1` → Pedra  
- `2` → Papel  
- `3` → Tesoura  

O **bot** faz uma escolha aleatória, e o programa exibe o resultado: 
 
✅ Vitória do jogador  
❌ Derrota  
🤝 Empate  

O jogo continua até o jogador digitar `0` para sair.

---

## 🧠 Regras do jogo

| Escolha do Jogador | Escolha do Bot | Resultado |
|--------------------|----------------|------------|
| Pedra              | Tesoura        | Vitória    |
| Papel              | Pedra          | Vitória    |
| Tesoura            | Papel          | Vitória    |
| Iguais             | Iguais         | Empate     |
| Caso contrário     |                | Derrota    |

---

## ⚙️ Tecnologias utilizadas

- **Linguagem:** Java  
- **Classes usadas:** `Scanner` e `Random`  
- **Paradigma:** Estruturado  
- **IDE recomendada:** VS Code ou IntelliJ IDEA  

---

## 🚀 Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/EngSoftFilipe/Jokempo.git
