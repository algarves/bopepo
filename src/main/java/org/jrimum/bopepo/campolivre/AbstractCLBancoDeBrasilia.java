/*
 * Copyright 2013 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 24/08/2013 - 19:54:00
 * 
 * ================================================================================
 * 
 * Direitos autorais 2013 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 24/08/2013 - 19:54:00
 * 
 */

package org.jrimum.bopepo.campolivre;

import org.jrimum.domkee.banco.Titulo;

/**
 * <p>
 * Interface comum para todos os campos livres do BRB - Banco de Brasília que
 * venham a existir.
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author <a href="mailto:contato@douglasramiro.com.br">Douglas Ramiro</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public abstract class AbstractCLBancoDeBrasilia extends AbstractCampoLivre {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3200353843356508888L;

	protected AbstractCLBancoDeBrasilia(Integer fieldsLength) {
		super(fieldsLength);
	}
	
	protected static CampoLivre create(Titulo titulo){
		return new CLBancoDeBrasilia().build(titulo);
	}	
}