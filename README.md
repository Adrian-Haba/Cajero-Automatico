# Cajero-Automatico 

		*Cajero automático (Interfaz grafica):
			Pagina de usuario y contraseña: BBDD[Uusarios(id, usuario, contraseña)]
			Pagina que te pregunte:
					1- Que cuenta usar?
					2- Crear cuenta BBDD(id, nombredecuenta)
						- Introduce el nombre de la cuenta a crear
					3- Eliminar cuenta
						-Introduce el nombre de la cuenta a eliminar
										- Salga mensaje de: seguro que quieres eliminar la cuenta? SI/NO
					4- Cerrar sesión

			Pagina de la cuenta que puedas hacer: BBDD[Cuenta(id_usuario,id_cuenta,nombrecuenta,saldo)]
					1- Introducir dinero
							-Que dinero desea introducir? 
					2- Sacar dinero
							- Que dinero desea retirar?
					*Fichero que "imprima un ticket de transacción al introducir/retirar dinero"
										
					3- Historial de transacciones [(BBDD tabla: id_cuenta, id_mov., fecha, concepto, importe, saldo)]
					4- Salir

					//El dinero se tendría que ver en todo momento y actualizar cuando nosotros hagamos alguna operación	


