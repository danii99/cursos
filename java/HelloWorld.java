class HelloWorld{
	public static void main(String[] args){
		Tempo t = new Tempo();
		t.hora = 20;
		Estado e = new Estado();
		e.valor = "bem";
		System.out.print("Ola " + args[0] + "!, faz ");
		System.out.print(t.hora);
		System.out.print(" minutos que voce logou, da ultima vez voce estava ");
		System.out.print(e.valor);
	}
}