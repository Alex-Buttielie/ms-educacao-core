package br.com.coreeduc.aplication.records;

public record StudentResourceForAssessmentInepEducacensoRecord (
        Integer readerAid,
        Integer transcriptionAid,
        Integer guideInterpreter,
        Integer signLanguageInterpreter,
        Integer lipReading,
        Integer enlargedPrintExamFont18,
        Integer superEnlargedPrintExamFont24,
        Integer audioCodeForVisuallyImpaired,
        Integer portugueseAsSecondLanguageExamForDeafAndHardOfHearing,
        Integer videoSignLanguageExam,
        Integer brailleMaterialAndExam,
        Integer none
        ) { }
