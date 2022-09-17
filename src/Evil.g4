grammar Evil;

prog: funcoes ;
funcoes: funcao* ;
funcao: 'fn' ID '(' params ')' ID bloco ;
param: ID ':' ID ;
params: (param (',' param)*)? ;
bloco: '{' stmt* '}' ;

corpo: bloco | stmt ;
stmt: condicional | declaracao | retorno | chamada ';' | atribuicao | pcada | enquanto ;
condicional: SE '(' iexpr ')' corpo (SENAO corpo)? ;
declaracao: SEJA ID (':' ID)? '=' iexpr ';' ;
atribuicao: ID ('=' | ATRARIT) iexpr ';' ;
pcada: PCADA '(' ID EM iexpr ')' corpo ;
enquanto: ENQUANTO '(' iexpr ')' corpo ;
retorno: RETORNA iexpr? ';' ;
chamada: ID '(' args ')' ;
args: (iexpr (',' iexpr)*)? ;

iexpr: expr ;

expr:
      NUM
    | chamada
    | STRING
    | BOOL
    | ID
    | NOT expr
    | NEG expr
    | AP expr ')'
    | expr EXP expr
    | expr MULMODDIV expr
    | expr OPBIN expr
    | expr ADDSUB expr
    | expr (OPEQ | OPREL) expr
    | expr LOGAND expr
    | expr LOGOR expr
    | expr LOGIMPL expr
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
EXP: '**' ;
ATRARIT: OPARIT '=' ;
MULMODDIV: [*/%] | '//' ;
ADDSUB: [+\-] ;
OPARIT: MULMODDIV | ADDSUB ;
OPEQ: '==' | '!=' ;
OPREL: ('>'|'<')'='? ;
OPBIN: '&' | '|' | '^' ;
LOGAND: '&&' ;
LOGOR: '||' ;
LOGIMPL: '->' ;
NOT: '!' ;
NEG: '-' ;
AP: '(' ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
STRING: '"' ([^"] | '\\"' | .)*? '"' ;
COM: '#' .*? [\n] -> skip ;
WS: [ \r\t\n]+ -> skip ;
