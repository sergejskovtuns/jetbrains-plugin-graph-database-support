package com.neueda.jetbrains.plugin.graphdb.language.cypher.completion.metadata.elements;

import com.intellij.codeInsight.completion.util.ParenthesesInsertHandler;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.neueda.jetbrains.plugin.graphdb.platform.GraphIcons;
import org.jetbrains.annotations.Nullable;

public class CypherProcedureElement implements CypherElement {

    private final String name;
    private final InvokableInformation information;

    public CypherProcedureElement(String name, String fullSignature, @Nullable String description) {
        this.name = name;
        this.information = extractInformation(fullSignature, name);
    }

    public InvokableInformation getInformation() {
        return information;
    }

    @Override
    public LookupElement getLookupElement() {
        return LookupElementBuilder
                .create(name)
                .bold()
                .withIcon(GraphIcons.Nodes.STORED_PROCEDURE)
                .withTailText(information.getSignature())
                .withTypeText(information.getReturnType())
                .withInsertHandler(ParenthesesInsertHandler.getInstance(information.isHasParameters()));
    }
}
