%% Get the translated interpreter:

:- [ 'v.pl' ].


%--- An example: some states, some queries... Note the two loops.



%   S3: q <--------- S2: p, s
%     \             /  ^
%      \           /   |
%       \         /    |
%        \       /     |
%         \     /      |
%          \   /       |
%           v v        |
%         S0: p ----> S1: p, q
%


proposition( p ).
proposition( q ).
proposition( s ).


state( s0 ).
state( s1 ).
state( s2 ).
state( s3 ).


trans( s0, s1 ).

trans( s1, s2 ).

trans( s2, s0 ).
trans( s2, s3 ).

trans( s3, s0 ).


holds( s0, p ).

holds( s1, p ).
holds( s1, q ).

holds( s2, p ).
holds( s2, s ).

holds( s3, q ).


%                                         Expected   v.pl

q1  :-  check( s0, f p ).              %  yes        yes

q2  :-  check( s3, f p ).              %  yes        yes

q3  :-  check( s0, f( p ^ q ) ).       %  yes        yes

q4  :-  check( s3, f( p ^ q ) ).       %  yes        yes

q5  :-  check( s0, g p ).              %  no         no

q6  :-  check( s0, g( p v q ) ).       %  yes        yes

