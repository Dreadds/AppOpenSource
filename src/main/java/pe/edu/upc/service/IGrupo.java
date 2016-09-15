package pe.edu.upc.service;

import pe.edu.upc.model.entity.GrupoVotacion;

//Interface  IGrupo que hereda de la interfaz IGenerico
//Se define los requerimientos funcionales que son propios de grupo
public interface IGrupo extends IGeneric<GrupoVotacion> {
	GrupoVotacion getByGrupoNroGrupo(String ng);
}

