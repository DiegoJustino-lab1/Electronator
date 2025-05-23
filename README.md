# Electronator

![License](https://img.shields.io/badge/license-MIT-blue.svg)

Electronator é um aplicativo Android, desenvolvido em Java no Android Studio, que permite navegar e comprar componentes eletrônicos diretamente do seu smartphone.

## 📋 Sumário 

- [Funcionalidades](#-funcionalidades)  
- [Tecnologias](#-tecnologias)  
- [Pré-requisitos](#-pré-requisitos)  
- [Instalação e Build](#-instalação-e-build)  
- [Uso](#-uso)  
- [Estrutura do Projeto](#-estrutura-do-projeto)  
- [Contribuição](#-contribuição)  
- [Licença](#-licença)  

## 🚀 Funcionalidades

- Catálogo completo de componentes (resistores, capacitores, microcontroladores etc.)  
- Busca e filtragem por categoria, preço e especificações  
- Detalhes do produto com imagens e ficha técnica  
- Carrinho de compras e cálculo automático de frete  
- Checkout integrado (PayPal, cartão de crédito)  
- Histórico de pedidos e status de entrega  
- Notificações push para promoções e atualização de pedido  

## 🛠️ Tecnologias

- **Android SDK 31+**  
- **Java 11+**  
- **Android Studio**  

## ⚙️ Pré-requisitos

- Android Studio instalado  
- SDK Android (API 31+)  
- Dispositivo Android ou emulador  

## 🔧 Instalação e Build

1. Clone o repositório:  
   ```bash
   git clone https://github.com/DiegoJustino-lab1/Electronator.git
   cd Electronator

   Abra o projeto no Android Studio:

File > Open e selecione a pasta raiz.

Aguarde a sincronização do Gradle e o download das dependências.

Conecte um dispositivo ou inicie um emulador.

Clique em Run (▶️) no Android Studio.

▶️ Uso
Navegue pelo catálogo ou use a busca para encontrar componentes.

Toque em um produto para ver detalhes e adicioná‑lo ao carrinho.

No carrinho, revise itens, selecione endereço e método de pagamento.

Finalize a compra e acompanhe o status no histórico de pedidos.

🗂️ Estrutura do Projeto
arduino
Copiar
Editar
.
├── app/                   
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/      # código Java
│   │   │   ├── res/       # layouts, drawables, strings
│   │   │   └── AndroidManifest.xml
│   └── build.gradle       
├── build.gradle           
├── settings.gradle        
└── README.md              
🤝 Contribuição
Faça um fork deste repositório.

Crie uma branch com sua feature:

bash
Copiar
Editar
git checkout -b feature/nova-funcionalidade
Commit suas mudanças:

bash
Copiar
Editar
git commit -m "Adiciona filtro por faixa de preço"
Envie para seu fork e abra um Pull Request.
