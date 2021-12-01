package controller;

public class BuilderHash {
	public int minhaFuncaoHash(long chave) {
		return (int)(chave % 3 *2);
	}
}
