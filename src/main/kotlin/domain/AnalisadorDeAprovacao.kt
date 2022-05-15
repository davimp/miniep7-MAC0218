package domain

import domain.criterios.CriterioDeAprovacao
import domain.criterios.Basico

class AnalisadorDeAprovacao {
    private var criterio : CriterioDeAprovacao = Basico()

    public fun defineCriterio(criterio:CriterioDeAprovacao) {
        this.criterio = criterio
    }

    public fun fechaBoletim(boletim:Boletim): BoletimFechado {
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, this.criterio.mediaFinal(boletim), this.criterio.estaAprovado(boletim))
    }

}