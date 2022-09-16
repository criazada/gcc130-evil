grammar Evil;

prog: funcoes ;
funcoes: funcao* ;
funcao: 'fn' ID '(' argumentos ')' ID bloco ;
argumento: ID ':' ID ;
argumentos: (argumento (',' argumento)*)? ;
bloco: '{' stmt* '}' ;

corpo: bloco | stmt ;
stmt: condicional | declaracao | retorno | chamada ';' | atribuicao | pcada | enquanto ;
condicional: SE '(' expr ')' corpo (SENAO corpo)? ;
declaracao: SEJA ID (':' ID)? '=' expr ';' ;
atribuicao: ID ('=' | ATRARIT) expr ';' ;
pcada: PCADA '(' ID EM expr ')' corpo ;
enquanto: ENQUANTO '(' expr ')' corpo ;
retorno: RETORNA expr? ';' ;
chamada: ID '(' params ')' ;
params: (expr (',' expr)*)? ;

expr:
      NUM #NExpNum
    | chamada #NExpCall
    | STRING #NExpStr
    | BOOL #NExpBool
    | ID #NExpRef
    | '!' expr #NExpNot
    | '-' expr #NExpNeg
    | '(' expr ')' #NExpPar
    | expr '**' expr #NExpExp
    | expr ('*' | '/' | '%' | '//') expr #NExpMulDiv
    | expr OPBIN expr #NExpBin
    | expr ('+' | '-') expr #NExpAddSub
    | expr OPREL expr #NExpRel
    | expr '&&' expr #NExpAnd
    | expr '||' expr #NExpOr
    | expr '->' expr #NExpImpl
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
