Open-source inference at scale is a mission of Redhat, along with Neural Magic that we just bought, bringing Brian Stevens back to Red Hat as CTO for AI.

Inference, the process by which a model generates new text in response to a user prompt.

Prompt -> Inference API [Model/Inference Server/Infra] -> Response

Inference tends to happen one token at a time and is extremely expensive.

KV cache is used within a transformer to re-use previous prompts, adding one token at a time to optimize inference.

Inference server manages KV cache and interactions with multiple models.

vLLM - industry standard for open-source inference.

Traditional LLM vs Reasoning Model - all tokens originally went back to client, but with reasoning models the cyclical approach happens more within the model (I think).

True open-source models still don't really exist, but we've gotten closer.


Red Hat is the No. 1 contributor in OSS GenAI Inference.

Inference platform requires model, inference server, and accelerators.

Inference is expensive, Red Hat is providing the AI Inference Server stack to enable industries to run open-source models on their own stack.  

