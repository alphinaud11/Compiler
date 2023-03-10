/**
 * Write your info here
 *
 * @name Mohamed Ahmed Helmy Elsayed Ali
 * @id 43-9565
 * @labNumber 15
 */

grammar Task9;

@members {
	/**
	 * Compares two integer numbers
	 *
	 * @param x the first number to compare
	 * @param y the second number to compare
	 * @return 1 if x is equal to y, and 0 otherwise
	 */
	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}
}
/*
s returns [int check]:
 // Write the definition of parser rule "s" here
    a c b {$check = equals($a.n, $b.n) * equals($a.n, $c.n);} ;

// Write additional lexer and parser rules here
a returns [int n]:
    'a' a1=a {$n = $a1.n + 1;}
    |  {$n = 0;} ;

b returns [int n]:
    'b' b1=b {$n = $b1.n + 1;}
    |  {$n = 0;} ;

c returns [int n]:
    'c' c1=c {$n = $c1.n + 1;}
    |  {$n = 0;} ;*/

/*s returns [int validUnions, int totalUnions, int check, int a, int b]:
    'a' {
    $validUnions = 0;
    $totalUnions = 0;
    $check = 1;
    $a = 1;
    $b = 0;
    }
    | 'b' {
          $validUnions = 0;
          $totalUnions = 0;
          $check = 1;
          $a = 0;
          $b = 1;
          }
    | 'e' {
          $validUnions = 0;
          $totalUnions = 0;
          $check = 1;
          $a = 0;
          $b = 0;
          }
    | '@' {
          $validUnions = 0;
          $totalUnions = 0;
          $check = 1;
          $a = 0;
          $b = 0;
          }
    | '(' s1=s 'U' s2=s ')' {
          $validUnions = $s1.validUnions + $s2.validUnions + equals($s1.a, $s2.b);
          $totalUnions = $s1.totalUnions + $s2.totalUnions + 1;
          $check = equals($validUnions, $totalUnions);
          $a = $s1.a + $s2.a;
          $b = $s1.b + $s2.b;
          }
    | '(' s1=s 'o' s2=s ')' {
          $validUnions = $s1.validUnions + $s2.validUnions;
          $totalUnions = $s1.totalUnions + $s2.totalUnions;
          $check = equals($validUnions, $totalUnions);
          $a = $s1.a + $s2.a;
          $b = $s1.b + $s2.b;
          }
    | '(' s1=s '*)' {
          $validUnions = $s1.validUnions;
          $totalUnions = $s1.totalUnions;
          $check = equals($validUnions, $totalUnions);
          $a = $s1.a;
          $b = $s1.b;
          };*/

s returns [int check, int a, int b]:
    'a' {
    $check = 1;
    $a = 1;
    $b = 0;
    }
    | 'b' {
          $check = 1;
          $a = 0;
          $b = 1;
          }
    | 'e' {
          $check = 1;
          $a = 0;
          $b = 0;
          }
    | '@' {
          $check = 1;
          $a = 0;
          $b = 0;
          }
    | '(' s1=s 'U' s2=s ')' {
          $check = $s1.check * $s2.check * equals($s1.a, $s2.b);
          $a = $s1.a + $s2.a;
          $b = $s1.b + $s2.b;
          }
    | '(' s1=s 'o' s2=s ')' {
          $check = $s1.check * $s2.check;
          $a = $s1.a + $s2.a;
          $b = $s1.b + $s2.b;
          }
    | '(' s1=s '*)' {
          $check = $s1.check;
          $a = $s1.a;
          $b = $s1.b;
          };