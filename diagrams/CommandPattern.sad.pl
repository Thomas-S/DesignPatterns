%------
% Prolog based representation of the Vespucci architecture diagram: D:/eclipse/workspace/DesignPatterns/diagrams/CommandPattern.sad
% Created by Vespucci, Technische Universität Darmstadt, Department of Computer Science
% www.opal-project.de

:- multifile ensemble/5.
:- multifile abstract_ensemble/5.
:- multifile outgoing/7.
:- multifile incoming/7.
:- multifile not_allowed/7.
:- multifile expected/7.
:- multifile global_incoming/7.
:- multifile global_outgoing/7.
:- multifile violation/7.
:- discontiguous ensemble/5.
:- discontiguous abstract_ensemble/5.
:- discontiguous outgoing/7.
:- discontiguous incoming/7.
:- discontiguous not_allowed/7.
:- discontiguous expected/7.

:- discontiguous global_incoming/7.
:- discontiguous global_outgoing/7.
:- discontiguous violation/7.

% Date <07/10/2011 14:08:03>.
%------

%------
%ensemble(File, Name, Ensemble Parameter, Query, SubEnsembles) :- Definition of an ensemble
%	File - The simple file name in which the ensemble is defined (e.g., 'Flashcards.sad')
%	Name - Name of the ensemble
%	Ensemble Parameter - Parameter of the ensemble
%	Query - Query that determines which source elements belong to the ensemble
%	SubEnsembles - List of all sub ensembles of this ensemble
%------
ensemble('CommandPattern.sad', 'Invoker', [], (class_with_members('org.pattern.command.concrete','LabAssistant') ), []).
ensemble('CommandPattern.sad', 'Command', [], (class_with_members('org.pattern.command.concrete','IPrintCommand')  or class_with_members('org.pattern.command.concrete','PDFPrintCommand')  or class_with_members('org.pattern.command.concrete','BlackWhitePrintCommand')  or class_with_members('org.pattern.command.concrete','ColorPrintCommand') ), []).
ensemble('CommandPattern.sad', 'Receiver', [], (class_with_members('org.pattern.command.concrete','ColorPrinter')  or class_with_members('org.pattern.command.concrete','PDFPrinter')  or class_with_members('org.pattern.command.concrete','BlackWhitePrinter') ), []).
ensemble('CommandPattern.sad', 'Client', [], (class_with_members('org.pattern.command.concrete','Client') ), []).

%------
%DEPENDENCY(File, ID, SourceE, SourceE Parameter, TargetE, TargetE Parameter, Type) :-Definition of a dependency between two ensembles.
%	DEPENDENCY - The type of the dependency. Possible values: outgoing, incoming, expected, not_allowed, global_incoming, global_outgoing, violation
%	File - The simple file name in which the dependency is defined (e.g., 'Flashcards.sad')
%	ID - An ID identifying the dependency
%	SourceE - The source ensemble
%	SourceE Parameter - Parameter of the source ensemble
%	TargetE - The target ensemble
%	TargetE Parameter - Parameter of the target ensemble
%	Relation classifier - Kinds of uses-relation between source and target ensemble (all, field_access, method_call,...)
%------
outgoing('CommandPattern.sad', 1, 'Invoker', [], 'Command', [], [create, call]).
not_allowed('CommandPattern.sad', 2, 'Invoker', [], 'Receiver', [], [all]).
outgoing('CommandPattern.sad', 3, 'Command', [], 'Receiver', [], [call]).
outgoing('CommandPattern.sad', 4, 'Client', [], 'Invoker', [], [create, call]).
