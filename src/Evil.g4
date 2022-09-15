grammar Evil;

@members {
  List<List<String>> scopes = new ArrayList<>();
  public void pushscope() {
    scopes.add(new ArrayList<String>());
  }

  public void popscope() {
    scopes.pop();
  }

  public void decfunction() {
    System.out.println(getCurrent
  }
}

prog: funcoes ;
funcoes: funcao* ;
funcao: 'fn' ID {decfunction();} '(' argumentos ')' ID {istype()}? bloco;
argumento: ID ':' ID {istype()}? ;
argumentos: (argumento (',' argumento)*)? ;
bloco: '{' {pushscope();} stmt* {popscope();} '}' ;

corpo: bloco | stmt ;
stmt: condicional | declaracao | chamada ';' | atribuicao | pcada | enquanto | retorno ;
condicional: SE '(' expr ')' corpo (SENAO corpo)? ;
declaracao: SEJA ID {!isdeclared()}? '=' expr ';' {declaracao();} ;
atribuicao: ID {isdeclared()}? ('=' | ATRARIT) expr ';' ;
pcada: PCADA '(' ID EM expr ')' corpo ;
enquanto: ENQUANTO '(' expr ')' corpo ;
retorno: RETORNA expr ';' ;
chamada: {isfunc()}? ID '(' params ')' ;
params: (expr (',' expr)*)? ;

expr:
      NUM
    | chamada
    | STRING
    | BOOL
    | ID {isdeclared()}?
    | '!' expr
    | '-' expr
    | '(' expr ')'
    | expr '**' expr
    | expr ('*' | '/' | '%' | '//') expr
    | expr OPBIN expr
    | expr ('+' | '-') expr
    | expr OPREL expr
    | expr '&&' expr
    | expr '||' expr
    | expr '->' expr
    ;

SEJA: 'seja' ;
SE: 'se' ;
SENAO: 'senao' | 'sn' ;
ENQUANTO: 'enquanto' | 'enqto' ;
PCADA: 'pcada' ;
RETORNA: 'retorna' ;
EM: 'em' ;
FN: 'fn' ;
BOOL: 'verdadeiro' | 'falso' ;
ATR: '=' ;
NUM: '-'? ('0' | [1-9]('_'?[0-9])*)('.'[0-9]('_'?[0-9])*)? ;
OPARIT: [+\-*/%] | '//' | '**' ;
OPREL: ('>'|'<')'='? | ('!' | '=')'=' ;
OPBIN: '&' | '|' | '^' ;
OPBOOL: '&&' | '||' | '->' ;
ATRARIT: OPARIT '=' ;
OPACC: '.' ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
STRING: '"' ([^"] | '\\"' | .)*? '"' ;
COM: '#' .*? [\n] -> skip ;
WS: [ \r\t\n]+ -> skip ;
