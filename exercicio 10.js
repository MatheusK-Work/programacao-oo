class Cofrinho {
    constructor() {
      this.total = 0
      this.moedas = {
        0.10: 0,
        0.25: 0,
        0.50: 0,
        1.00: 0
      }
    }
  
    adicionarMoeda(valor) {
      const valoresValidos = [0.10, 0.25, 0.50, 1.00]
      if (valoresValidos.includes(valor)) {
        this.moedas[valor.toFixed(2)]++
        this.total += valor
      } else {
        console.log("Moeda inválida.")
      }
    }
  
    quebrar() {
      console.log(`Você quebrou o cofrinho. Total guardado: R$ ${this.total.toFixed(2)}`)
      this.total = 0
      for (let valor in this.moedas) {
        this.moedas[valor] = 0
      }
    }
  
    verificarTotal() {
      console.log(`Total acumulado: R$ ${this.total.toFixed(2)}`)
    }
  
    quantidadePorTipo() {
      console.log("Quantidade de moedas por tipo:")
      for (let valor in this.moedas) {
        console.log(`R$ ${valor} -> ${this.moedas[valor]} moedas`)
      }
    }
  }
  