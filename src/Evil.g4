grammar Evil;

prog: funcoes ;
funcoes: funcao* ;
funcao: 'fn' ID '(' argumentos ')' {istype()}? ID bloco;
argumento: ID ':' {istype()}? ID ;
argumentos: (argumento (',' argumento)*)? ;
bloco: '{' stmt* '}' ;
corpo: bloco | stmt ;
stmt: condicional | declaracao | chamada ';' | atribuicao | pcada | enquanto | retorno ;
condicional: SE '(' expr ')' corpo (SENAO corpo)? ;
declaracao: SEJA {!isdeclared()}? ID '=' expr ';' ;
atribuicao: {isdeclared()}? ID ('=' | ATRARIT) expr ';' ;
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
    | {isdeclared()}? ID
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
